// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelRuneSmithCape extends ModelBase {
	private final ModelRenderer hand_left;
	private final ModelRenderer hand_right;
	private final ModelRenderer body;
	private final ModelRenderer cape;

	public WFMModelRuneSmithCape() {
		textureWidth = 64;
		textureHeight = 32;

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(hand_left, 0.0F, 3.1416F, 0.0F);
		hand_left.cubeList.add(new ModelBox(hand_left, 0, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.5F, true));

		hand_right = new ModelRenderer(this);
		hand_right.setRotationPoint(-5.0F, 2.0F, 0.0F);
		hand_right.cubeList.add(new ModelBox(hand_right, 0, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.5F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.5F, false));

		cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, 1.0F, 3.0F);
		body.addChild(cape);
		setRotationAngle(cape, 0.2182F, 0.0F, 0.0F);
		cape.cubeList.add(new ModelBox(cape, 32, 0, -8.0F, -2.0F, 0.0F, 16, 21, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		hand_left.render(f5);
		hand_right.render(f5);
		body.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}