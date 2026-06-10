// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class greatWolfHelmet extends ModelBase {
	private final ModelRenderer head;

	public greatWolfHelmet() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 32, 20, -4.0F, -12.0F, -4.0F, 8, 4, 8, 0.5F, false));
		head.cubeList.add(new ModelBox(head, 24, -7, 4.0F, -15.0F, -3.0F, 0, 4, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 24, -7, -4.0F, -15.0F, -3.0F, 0, 4, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 21, -2.5F, -10.0F, -9.0F, 5, 6, 5, 0.5F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -7.0F, -4.0F, 8, 8, 8, 0.5F, false));
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