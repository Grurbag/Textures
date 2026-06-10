// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer hand_left;
	private final ModelRenderer cape;
	private final ModelRenderer cape2;
	private final ModelRenderer cape3;
	private final ModelRenderer body;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(-5.0F, 2.0F, 0.0F);
		hand_left.cubeList.add(new ModelBox(hand_left, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, 0.0F, 1.0F);
		hand_left.addChild(cape);
		cape.cubeList.add(new ModelBox(cape, 0, 0, -3.5F, -2.0F, 1.5F, 7, 16, 0, 0.0F, false));

		cape2 = new ModelRenderer(this);
		cape2.setRotationPoint(-2.0F, 0.0F, 1.0F);
		hand_left.addChild(cape2);
		setRotationAngle(cape2, 0.0F, -1.5708F, 0.0F);
		cape2.cubeList.add(new ModelBox(cape2, 14, 0, -3.5F, -2.0F, 1.5F, 5, 16, 0, 0.0F, false));

		cape3 = new ModelRenderer(this);
		cape3.setRotationPoint(0.0F, 0.0F, 0.0F);
		cape2.addChild(cape3);
		setRotationAngle(cape3, 0.0F, -1.5708F, 0.0F);
		cape3.cubeList.add(new ModelBox(cape3, -5, 16, -4.5F, -2.0F, -1.5F, 6, 0, 5, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		hand_left.render(f5);
		body.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}