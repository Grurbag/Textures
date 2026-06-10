// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelNorskaJarlBody extends ModelBase {
	private final ModelRenderer bipedBody;
	private final ModelRenderer cape;
	private final ModelRenderer hide;
	private final ModelRenderer head;
	private final ModelRenderer nose;
	private final ModelRenderer horn;
	private final ModelRenderer horn2;
	private final ModelRenderer horn3;
	private final ModelRenderer hand_left;

	public WFMModelNorskaJarlBody() {
		textureWidth = 64;
		textureHeight = 64;

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.5F, false));

		cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, 1.0F, 4.0F);
		bipedBody.addChild(cape);
		setRotationAngle(cape, 0.2182F, 0.0F, 0.0F);
		cape.cubeList.add(new ModelBox(cape, 32, 0, -8.5F, -2.0F, 0.0F, 16, 25, 0, 0.0F, false));

		hide = new ModelRenderer(this);
		hide.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.addChild(hide);
		hide.cubeList.add(new ModelBox(hide, 0, 53, -8.0F, -4.0F, -1.0F, 17, 5, 6, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(5.0F, -4.0F, -1.0F);
		hide.addChild(head);
		setRotationAngle(head, 1.1345F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 28, 33, -4.0F, 0.0F, -9.0F, 8, 4, 10, 0.0F, false));

		nose = new ModelRenderer(this);
		nose.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(nose);
		nose.cubeList.add(new ModelBox(nose, 37, 29, -2.0F, -1.0F, -9.0F, 4, 1, 3, 0.0F, false));

		horn = new ModelRenderer(this);
		horn.setRotationPoint(-7.0F, 0.0F, 2.0F);
		hide.addChild(horn);
		setRotationAngle(horn, 0.0F, 0.5236F, 0.0F);
		horn.cubeList.add(new ModelBox(horn, 0, 45, -10.0F, -7.0F, -1.0F, 11, 7, 0, 0.0F, false));

		horn2 = new ModelRenderer(this);
		horn2.setRotationPoint(7.0F, 0.0F, 0.0F);
		bipedBody.addChild(horn2);
		setRotationAngle(horn2, 0.0F, 2.618F, 0.0F);
		horn2.cubeList.add(new ModelBox(horn2, 0, 45, -10.0F, -7.0F, -1.0F, 11, 7, 0, 0.0F, false));

		horn3 = new ModelRenderer(this);
		horn3.setRotationPoint(0.5F, -4.5F, 3.0F);
		bipedBody.addChild(horn3);
		setRotationAngle(horn3, -2.1817F, 0.0F, 3.1416F);
		horn3.cubeList.add(new ModelBox(horn3, 50, 55, -3.0F, -7.5F, 0.0F, 7, 9, 0, 0.0F, false));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(7.0F, 2.0F, 0.0F);
		hand_left.cubeList.add(new ModelBox(hand_left, 0, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.5F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipedBody.render(f5);
		hand_left.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}