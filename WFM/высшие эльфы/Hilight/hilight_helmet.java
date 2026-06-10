// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class hilight_helmet extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer Head_r1;

	public hilight_helmet() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -7.2F, -4.0F, 8, 8, 8, 0.2F, false));
		head.cubeList.add(new ModelBox(head, 0, 16, -4.0F, -7.2F, -4.0F, 8, 8, 8, 0.4F, false));
		head.cubeList.add(new ModelBox(head, 32, 0, -4.0F, -8.2F, -4.0F, 8, 2, 8, 0.21F, false));

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.addChild(Head_r1);
		setRotationAngle(Head_r1, -0.1309F, 0.0F, 0.0F);
		Head_r1.cubeList.add(new ModelBox(Head_r1, 37, 22, -5.0F, -37.8F, -7.5F, 10, 9, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}